package com.sky.service.impl;

import com.sky.entity.Function;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sky.mapper.FunctionMapper;
import com.sky.service.IFunctionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lantian
 * @since 2019-01-11
 */
@Service
public class FunctionServiceImpl
		extends ServiceImpl<FunctionMapper, Function>
		implements IFunctionService {

}
