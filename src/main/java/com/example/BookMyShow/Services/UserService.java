package com.example.BookMyShow.Services;

import com.example.BookMyShow.Converters.UserConvertor;
import com.example.BookMyShow.Entities.UserEntity;
import com.example.BookMyShow.EntityDtos.UserEntryDto;
import com.example.BookMyShow.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }



}
