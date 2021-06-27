package com.lzx.Mapper;

import com.lzx.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {



    @Override
    public List<User> getUser() {
        SqlSession sqlSession = getSqlSession();
        return sqlSession.getMapper(UserMapper.class).getUser();
    }
}
