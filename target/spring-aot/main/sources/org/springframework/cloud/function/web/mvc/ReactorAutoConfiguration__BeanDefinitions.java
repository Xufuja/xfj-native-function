package org.springframework.cloud.function.web.mvc;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.function.context.FunctionCatalog;
import org.springframework.cloud.function.context.FunctionProperties;
import org.springframework.cloud.function.web.StringConverter;

/**
 * Bean definitions for {@link ReactorAutoConfiguration}
 */
public class ReactorAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'reactorAutoConfiguration'
   */
  public static BeanDefinition getReactorAutoConfigurationBeanDefinition() {
    Class<?> beanType = ReactorAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ReactorAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'functionHandlerMapping'.
   */
  private static BeanInstanceSupplier<FunctionHandlerMapping> getFunctionHandlerMappingInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FunctionHandlerMapping>forFactoryMethod(ReactorAutoConfiguration.class, "functionHandlerMapping", FunctionProperties.class, FunctionCatalog.class, FunctionController.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ReactorAutoConfiguration.class).functionHandlerMapping(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'functionHandlerMapping'
   */
  public static BeanDefinition getFunctionHandlerMappingBeanDefinition() {
    Class<?> beanType = FunctionHandlerMapping.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<FunctionHandlerMapping> instanceSupplier = getFunctionHandlerMappingInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(FunctionHandlerMapping__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'functionStringConverter'.
   */
  private static BeanInstanceSupplier<StringConverter> getFunctionStringConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<StringConverter>forFactoryMethod(ReactorAutoConfiguration.class, "functionStringConverter", ConfigurableListableBeanFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ReactorAutoConfiguration.class).functionStringConverter(args.get(0)));
  }

  /**
   * Get the bean definition for 'functionStringConverter'
   */
  public static BeanDefinition getFunctionStringConverterBeanDefinition() {
    Class<?> beanType = StringConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getFunctionStringConverterInstanceSupplier());
    return beanDefinition;
  }
}
