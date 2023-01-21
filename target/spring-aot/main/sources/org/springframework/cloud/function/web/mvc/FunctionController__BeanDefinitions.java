package org.springframework.cloud.function.web.mvc;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FunctionController}
 */
public class FunctionController__BeanDefinitions {
  /**
   * Get the bean definition for 'functionController'
   */
  public static BeanDefinition getFunctionControllerBeanDefinition() {
    Class<?> beanType = FunctionController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(FunctionController::new);
    return beanDefinition;
  }
}
