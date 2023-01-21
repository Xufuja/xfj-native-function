package dev.xfj.xfjnativefunction;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link XfjNativeFunctionApplication}.
 */
public class XfjNativeFunctionApplication__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static XfjNativeFunctionApplication apply(RegisteredBean registeredBean,
      XfjNativeFunctionApplication instance) {
    AutowiredFieldValueResolver.forRequiredField("springTemplateEngine").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
