package org.springframework.cloud.function.web.mvc;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link FunctionHandlerMapping}.
 */
public class FunctionHandlerMapping__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static FunctionHandlerMapping apply(RegisteredBean registeredBean,
      FunctionHandlerMapping instance) {
    AutowiredFieldValueResolver.forRequiredField("prefix").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
