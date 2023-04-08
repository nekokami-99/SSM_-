import com.itheima.mapper.AcMapper;
import com.itheima.pojo.Ac;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ACtest {


/*     ��1��*��ѯ�γ�id=2�Ŀγ���Ϣ*
* */

@Test
public void textselectById() throws IOException  {
    int id=2;
    //* 1.
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //* 2.
    SqlSession sqlSession = sqlSessionFactory.openSession();
    //* 3.
    AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
    //* 4.
    Ac ac = acMapper.selectById1(id);
    System.out.println(ac);
    //* 5.
    sqlSession.close();
}
/*     (2)��ѯ�����м����ѧԺ����Ŀγ���Ϣ
* */

    @Test
    public void textselectAll() throws IOException  {
        //* 1.
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //* 2.
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //* 3.
        AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
        //* 4.
        List<Ac> brands = acMapper.selectAll1();
        System.out.println(brands);
        //* 5.
        sqlSession.close();
    }


    /*     (3)�� id=4 ��?�γ̵Ŀ�ʱ���޸�Ϊ 32+8=40��
     * */


    @Test
    public void update() throws IOException  {
       int id =4;
       int hours = 40;
        //�������
        //companyName="%" + companyName +"%";
        //brandName = "%" + brandName + "%";
        //description = "%" + description + "%";


        Map map = new HashMap();
        map.put("hours",hours);
        map.put("id",id);
        //* 1.
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //* 2.openSession()�и�Ϊture�򴫻����ݿ⣬���򲻸ı����ݿ�������
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //* 3.
        AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
        //* 4.
        acMapper.update1(map);

        //*�ύ����
        //*sqlsession.commit();
        // * 5.
        sqlSession.close();
    }


    /*     (4). ��??���µĿγ̼�¼�� name=��?���ݴ洢����hours=32��schools =1��
     * */
    @Test
    public void add() throws IOException  {

        String  name ="�����ݴ洢";
        int hours = 32;
        int sid =1;
        //�������
        //companyName="%" + companyName +"%";
        //brandName = "%" + brandName + "%";
        //description = "%" + description + "%";


        Map map = new HashMap();
        map.put("name" , name);
        map.put("hours", hours);
        map.put("sid" , sid);

        //* 1.
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //* 2.
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //* 3.
        AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
        //* 4.

        acMapper.add1(map);

        //*�ύ����
        //*sqlsession.commit();
        // * 5.
        sqlSession.close();
    }

    /*     (5). .������е�ѧԺ����Ŀγ���Ϣ��
     * */
    @Test
    public void textselectAll2() throws IOException  {
        //* 1.
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //* 2.
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //* 3.
        AcMapper acMapper = sqlSession.getMapper(AcMapper.class);
        //* 4.
        List<Ac> brands = acMapper.selectAllSid();
        System.out.println(brands);
        //* 5.
        sqlSession.close();
    }
}

