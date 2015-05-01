package io.nuun.extension.configuration;

import io.nuun.kernel.core.AbstractPlugin;
import io.nuun.kernel.spi.KernelExtension;
import org.apache.commons.configuration.CompositeConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * @author Pierre Thirouin
 *         Date: 01/05/15
 */
public class ConfigurationPlugin extends AbstractPlugin implements KernelExtension<ConfigurationProvider> {

    private final CompositeConfiguration configuration = new CompositeConfiguration();

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationPlugin.class);

    @Override
    public String name() {
        return "configuration-plugin";
    }

    @Override
    public void initialized(Collection<ConfigurationProvider> extendedPlugins) {
        for (ConfigurationProvider extendedPlugin : extendedPlugins) {
            LOGGER.debug("Register configuration from " + extendedPlugin.getClass().getName());
            configuration.addConfiguration(extendedPlugin.getConfiguration());
        }
    }

    @Override
    public Object nativeUnitModule() {
        return new ConfigurationModule(configuration);
    }

    // ----

    @Override
    public void initializing(Collection<ConfigurationProvider> extendedPlugins) {
        // Nothing to do
    }

    @Override
    public void starting(Collection<ConfigurationProvider> extendedPlugins) {
        // Nothing to do
    }

    @Override
    public void started(Collection<ConfigurationProvider> extendedPlugins) {
        // Nothing to do
    }

    @Override
    public void stopping(Collection<ConfigurationProvider> extendedPlugins) {
        // Nothing to do
    }

    @Override
    public void stopped(Collection<ConfigurationProvider> extendedPlugins) {
        // Nothing to do
    }
}
