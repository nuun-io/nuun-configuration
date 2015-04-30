package io.nuun.extension.configuration;

import io.nuun.kernel.core.AbstractPlugin;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pierre Thirouin
 *         Date: 01/05/15
 */
public class FixtureConfigPlugin extends AbstractPlugin implements ConfigurationProvider {
    @Override
    public String name() {
        return "fixture-config-plugin";
    }

    @Override
    public Map<String, Object> getConfiguration() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key1", 1);
        map.put("key2", 2);
        return map;
    }
}
