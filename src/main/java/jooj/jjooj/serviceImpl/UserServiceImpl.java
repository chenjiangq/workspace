package jooj.jjooj.serviceImpl;

import jooj.jjooj.bean.User;
import jooj.jjooj.mapper.UserMapper2;
import jooj.jjooj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper2 userMapper;

    /**
     * @Cacheable("selectUserList") 注解的selectUserList标识
     * 在缓存中开辟了一个名称为selectUserList的缓存空间，用来储存查询出来的用户列表
     * @return
     */
    @Cacheable("selectUserList")
    public List<User> selectUserList(){
        System.out.println("123123");
       return userMapper.selectAll();
    }
}
