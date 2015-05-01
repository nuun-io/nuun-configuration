package io.nuun.extension.configuration;

import io.nuun.kernel.api.Kernel;
import io.nuun.kernel.tests.it.NuunITRunner;
import io.nuun.kernel.tests.it.annotations.WithParams;
import org.apache.commons.configuration.Configuration;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

/**
 * @author Pierre Thirouin
 *         Date: 01/05/15
 */
@WithParams({Kernel.NUUN_ROOT_PACKAGE, "io.nuun.extension"})
@RunWith(NuunITRunner.class)
public class ConfigurationProviderIT {

    @Inject
    Configuration configuration;

    @Test
    public void testConfigurationExtension() {
        Assertions.assertThat(configuration).isNotNull();
        Assertions.assertThat(configuration.getProperty("key1")).isEqualTo(1);
        Assertions.assertThat(configuration.getString("key2")).isEqualTo(2);
    }
}
