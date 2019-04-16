package com.my.blog.website.controller;

import com.my.blog.website.config.query.core.BaseRepository;
import com.my.blog.website.modal.Bo.RestResponseBo;
import com.my.blog.website.modal.Vo.AttachVo;
import com.my.blog.website.repository.AttachVoRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Instant;

@RestController("/test")
public class TestForJpaController {
    @Resource
    private AttachVoRepository attachVoRepository;
    private static Example<AttachVo> example;
    private static AttachVo attachVo = new AttachVo();
    static {
        attachVo.setCreated((int)Instant.now().getEpochSecond());
        attachVo.setAuthorId(1);
        attachVo.setFkey("fkey");
        attachVo.setFname("fname");
        attachVo.setFtype("ftype");
        example = Example.of(attachVo, ExampleMatcher.matchingAny());
    }

    @GetMapping
    public RestResponseBo countByExample(){
        long count = attachVoRepository.count(example);
        return RestResponseBo.ok().setPayload(count);
    }

//    public RestResponseBo deleteByExample(){
//        long count = attachVoRepository.delete(example);
//        return RestResponseBo.ok().setPayload(count);
//    }
//
//    public RestResponseBo deleteByPrimaryKey(){
//        int count = attachVoRepository.deleteById(attachVo.getId());
//        return RestResponseBo.ok().setPayload(count);
//    }
//
//    public RestResponseBo insert(){
//        int count = attachVoRepository.insert(attachVo);
//        return RestResponseBo.ok().setPayload(count);
//    }
//
//    public RestResponseBo updateByPrimaryKey(){
//        attachVoRepository.save(attachVo);
//        return RestResponseBo.ok();
//    }
}
