package mapper;

import org.apache.ibatis.annotations.Param;

public interface DemoMapper {

	 String getLanguageByUser(@Param("userName") String userName);

	 String getMessageByLanguage(@Param("language") String language);
}
