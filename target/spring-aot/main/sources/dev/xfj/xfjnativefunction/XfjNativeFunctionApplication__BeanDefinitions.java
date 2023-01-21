package dev.xfj.xfjnativefunction;

import java.lang.Class;
import java.lang.String;
import java.util.function.Function;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link XfjNativeFunctionApplication}
 */
public class XfjNativeFunctionApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'xfjNativeFunctionApplication'
   */
  public static BeanDefinition getXfjNativeFunctionApplicationBeanDefinition() {
    Class<?> beanType = XfjNativeFunctionApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(XfjNativeFunctionApplication.class);
    InstanceSupplier<XfjNativeFunctionApplication> instanceSupplier = InstanceSupplier.using(XfjNativeFunctionApplication$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(XfjNativeFunctionApplication__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'request'.
   */
  private static BeanInstanceSupplier<Function> getRequestInstanceSupplier() {
    return BeanInstanceSupplier.<Function>forFactoryMethod(XfjNativeFunctionApplication.class, "request")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(XfjNativeFunctionApplication.class).request());
  }

  /**
   * Get the bean definition for 'request'
   */
  public static BeanDefinition getRequestBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(Function.class, String.class, String.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRequestInstanceSupplier());
    return beanDefinition;
  }
}
