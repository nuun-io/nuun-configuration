Nuun Configuration [![Build status](https://travis-ci.org/nuun-io/nuun-configuration.svg?branch=master)](https://travis-ci.org/nuun-io/nuun-configuration)
==================

Nuun-configuration is a Kernel extension aggregating properties from plugins implementing the ConfigurationProvider
interface.

```xml
<dependency>
  <groupId>io.nuun</groupId>
  <artifactId>nuun-configuration</artifactId>
  <version>???</version>
</dependency>
```

## Usage

### Create a configuration plugin

```java
public class YAMLConfigurationPlugin extends AbstractPlugin implements ConfigurationProvider {

    @Override
    public Configuration getConfiguration() {
        ...
    }

    ...

}

### Get configuration from a user class

```java
public class MyClass {

    @Inject
    private Configuration configuration;

}
```

### Get configuration from a plugin

```java
public class MyPlugin extends AbstractPlugin {

    @Override
    public Collection<Class<? extends Plugin>> requiredPlugins() {
        return collectionOf(ConfigurationPlugin.class);
    }

    @Override
    public InitState init(InitContext initContext) {
        ConfigurationPlugin configPlugin = (ConfigurationPlugin) initContext.pluginsRequired().iterator().next();
        Configuration configuration = configPlugin.getConfiguration();
        ...
        return InitState.INITIALIZED;
    }

}
```

Copyright and license

Code is released under [LGPLv3 license](LICENSE).