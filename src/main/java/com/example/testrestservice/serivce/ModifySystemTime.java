package com.example.testrestservice.serivce;

import com.example.testrestservice.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;

@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifySystemTime implements MyModifyService {
@Override
    public Response modify(Response response){
    response.setSystemTime("");
    return response;
}
}
