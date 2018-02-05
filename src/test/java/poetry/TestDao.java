package poetry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lin.RunnerApplication;
import com.lin.dao.peotry.PoetryWordBeanMapper;
import com.lin.entity.peotry.PoetryWordBean;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunnerApplication.class) //springboot程序的测试引导入口
public class TestDao<T> {
	@Autowired
	private PoetryWordBeanMapper poetryWordBeanMapper;
	
	@Before
	public void setup() throws Exception {
		
	}
	
	@Test
	public void testAdd(){
		PoetryWordBean word = new PoetryWordBean();
		word.setRhythm(11);
		word.setWord("测试");
		word.setWordFinalType(1);
		word.setWordSize(2);
//		assertNotNull(poetryWordBeanMapper);
		poetryWordBeanMapper.insert(word);
	}
}
