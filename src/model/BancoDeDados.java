package model;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BancoDeDados {

    private static EntityManagerFactory conexao;

    public static EntityManager getconexao() {
        return conexao.createEntityManager();
    }

    public static void iniciarBanco(String ip, String usuario, String senha, String banco) {

        Map<String, String> map = new HashMap();
        map.put("javax.persistence.jdbc.url", "jdbc:postgresql://" + ip.trim() + ":5433/" + banco.trim());
        map.put("javax.persistence.jdbc.user", usuario);
        map.put("javax.persistence.jdbc.password", senha);
        map.put("javax.persistence.jdbc.driver", "org.postgresql.Driver");
        //map.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        map.put("hibernate.hbm2ddl.auto", "update");
        //map.put("hibernate.connection.shutdown", "true");
        //map.put("hibernate.show_sql", "true");
        //map.put("hibernate.format_sql", "false");

        conexao = Persistence.createEntityManagerFactory("conexao", map);

//<property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/controllab"/>
//<property name="javax.persistence.jdbc.user" value="postgres"/>
//<property name="javax.persistence.jdbc.driver" value="org.postgresql.Driver"/>
//<property name="javax.persistence.jdbc.password" value="postgres"/>
//<property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
//<property name="hibernate.hbm2ddl.auto" value="update"/>
//<property name="hibernate.connection.shutdown" value="true"/>
//<property name="hibernate.show_sql" value="true"/>
//<property name="hibernate.format_sql" value="false"/>

    }
}
