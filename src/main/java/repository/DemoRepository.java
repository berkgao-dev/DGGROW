package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mapper.DemoMapper;

@Repository
public class DemoRepository {
 
    @Autowired
    private DemoMapper demoMapper;
 
    public DemoRepository(DemoMapper demoMapper) {
        this.demoMapper = demoMapper;
    }
 
    public String getMessageByUser(String userName) {
        String language = demoMapper.getLanguageByUser(userName);
 
        return demoMapper.getMessageByLanguage(language);
    }}
