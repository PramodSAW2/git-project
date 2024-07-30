package demo_git_project.service.impl;

import demo_git_project.entity.User;
import demo_git_project.repository.UserRepository;
import demo_git_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepository userRepository;
    @Override
    public User createReg(User user) {
      return  userRepository.save(user);

    }

    @Override
    public User getAllByDetails(Long id) {
        return null;
    }
}
