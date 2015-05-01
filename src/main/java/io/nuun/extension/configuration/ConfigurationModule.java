package io.nuun.extension.configuration;

import com.google.inject.AbstractModule;
import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.Configuration;

/**
 * @author Pierre Thirouin
 *         Date: 01/05/15
 */
public class ConfigurationModule extends AbstractModule {

    private final CompositeConfiguration configuration;

    public ConfigurationModule(CompositeConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    protected void configure() {
        bind(Configuration.class).toInstance(configuration);
    }
}
