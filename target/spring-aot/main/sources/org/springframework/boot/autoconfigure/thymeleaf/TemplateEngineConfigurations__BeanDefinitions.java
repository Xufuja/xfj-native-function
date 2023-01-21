package org.springframework.boot.autoconfigure.thymeleaf;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TemplateEngineConfigurations}
 */
public class TemplateEngineConfigurations__BeanDefinitions {
  /**
   * Bean definitions for {@link TemplateEngineConfigurations.DefaultTemplateEngineConfiguration}
   */
  public static class DefaultTemplateEngineConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'defaultTemplateEngineConfiguration'
     */
    public static BeanDefinition getDefaultTemplateEngineConfigurationBeanDefinition() {
      Class<?> beanType = TemplateEngineConfigurations.DefaultTemplateEngineConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(TemplateEngineConfigurations.DefaultTemplateEngineConfiguration::new);
      return beanDefinition;
    }
  }
}
