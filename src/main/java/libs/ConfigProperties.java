package libs;

import org.aeonbits.owner.Config;

@Config.Sources({"file:src/main/java/libs/ConfigProperties.properties"})
public interface ConfigProperties extends Config {
    long TIME_FOR_DFFAULT_WAIT();
    long TIME_FOR_EXPLICIT_WAIT_LOW();
    long TIME_FOR_EXPLICIT_WAIT_HIGHT();

    String base_url();
    String prod_url();
    String admin_url();
    String stage_url();
    String DATA_FILE();
    String DATA_FILE_PATH();
    String Oracle();
    String MySQL();
    String sqlServer();

    String MySQL_DB();
    String MySQL_DB_USER();
    String MySQL_DB_PASSWORD();
}
