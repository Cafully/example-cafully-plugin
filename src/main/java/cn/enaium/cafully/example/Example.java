package cn.enaium.cafully.example;

import cn.enaium.cafully.plugin.annotation.Plugin;
import cn.enaium.cafully.plugin.api.IInitializer;
import cn.enaium.cafully.plugin.helper.IHelper;

/**
 * @author Enaium
 */
@Plugin(unique = "example", name = "Example Plugin", version = "1.0.0", api = ">=1.1.1")
public class Example implements IInitializer {
    @Override
    public void initialize(IHelper plugin) throws Throwable {
        plugin.plugin().logger().info("Hello Example World!");
    }
}
