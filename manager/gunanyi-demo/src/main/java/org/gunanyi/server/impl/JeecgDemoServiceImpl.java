package org.gunanyi.server.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.gunanyi.entity.JeecgDemo;
import org.gunanyi.mapper.JeecgDemoMapper;
import org.gunanyi.server.IJeecgDemoService;
import org.springframework.stereotype.Service;

@Service
public class JeecgDemoServiceImpl extends ServiceImpl<JeecgDemoMapper, JeecgDemo> implements IJeecgDemoService {

}
