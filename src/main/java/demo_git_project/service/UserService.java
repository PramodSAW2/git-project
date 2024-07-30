package demo_git_project.service;

import demo_git_project.entity.User;

public interface UserService {
    User createReg(User user);

    User getAllByDetails(Long id);

}
