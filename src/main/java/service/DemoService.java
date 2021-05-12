package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.DemoRepository;

@Service
public class DemoService {
 
    @Autowired
    private DemoRepository demoRepository;
 
    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }
 
    public String welcome(String userName) {
        return demoRepository.getMessageByUser(userName);
    }
 
}