package io.nuun.extension.configuration;

import io.nuun.kernel.api.Kernel;
import io.nuun.kernel.tests.it.NuunITRunner;
import io.nuun.kernel.tests.it.annotations.WithParams;
import org.junit.runner.RunWith;

import javax.inject.Inject;

/**
 * @author Pierre Thirouin
 *         Date: 01/05/15
 */
@WithParams({Kernel.NUUN_ROOT_PACKAGE, "com.github.pith.typedconfig"})
@RunWith(NuunITRunner.class)
public class ConfigurationProviderIT {

    @Inject

}
