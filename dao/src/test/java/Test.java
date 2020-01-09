import com.dongtao.dao.ItemsDao;
import com.dongtao.domain.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 40293 on 2020/1/8.
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        ItemsDao itemsDao= applicationContext.getBean(ItemsDao.class);
        Items items = itemsDao.findItemsById(1);
        System.out.println(items.getName());
    }
}
