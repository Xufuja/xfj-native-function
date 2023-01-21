package dev.xfj.xfjnativefunction;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

/**
 * Bean definitions for {@link ThymeleafConfiguration}
 */
public class ThymeleafConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'thymeleafConfiguration'
   */
  public static BeanDefinition getThymeleafConfigurationBeanDefinition() {
    Class<?> beanType = ThymeleafConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(ThymeleafConfiguration.class);
    beanDefinition.setInstanceSupplier(ThymeleafConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'templateResolver'.
   */
  private static BeanInstanceSupplier<SpringResourceTemplateResolver> getTemplateResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SpringResourceTemplateResolver>forFactoryMethod(ThymeleafConfiguration.class, "templateResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ThymeleafConfiguration.class).templateResolver());
  }

  /**
   * Get the bean definition for 'templateResolver'
   */
  public static BeanDefinition getTemplateResolverBeanDefinition() {
    Class<?> beanType = SpringResourceTemplateResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTemplateResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'templateEngine'.
   */
  private static BeanInstanceSupplier<SpringTemplateEngine> getTemplateEngineInstanceSupplier() {
    return BeanInstanceSupplier.<SpringTemplateEngine>forFactoryMethod(ThymeleafConfiguration.class, "templateEngine")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ThymeleafConfiguration.class).templateEngine());
  }

  /**
   * Get the bean definition for 'templateEngine'
   */
  public static BeanDefinition getTemplateEngineBeanDefinition() {
    Class<?> beanType = SpringTemplateEngine.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTemplateEngineInstanceSupplier());
    return beanDefinition;
  }
}
