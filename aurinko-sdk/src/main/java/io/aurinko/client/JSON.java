/*
 * Aurinko.io API
 * ## Introduction The Aurinko API is a unified API platform allowing developers to quickly build integrations with many mailbox providers and services like Google, Office 365, Outlook.com, MS Exchange, IMAP. The unified API abstracts away differences between many email, calendar, contact, task APIs to make it easy to connect and sync the mailbox data.  The Aurinko API's focus is convenient and reliable data synchronization for all supported data categories (email, calendar, contacts, tasks) so the API provides methods to receive changes/deltas and be notified of the changes (through webhooks) in a unified manner. The API's sync/deltas model should allow developers to build reliable event based solutions easily.  The Aurinko API is built on HTTP. Our API is RESTful. It has predictable resource URLs. It returns HTTP response codes to indicate errors. It also accepts and returns JSON in the HTTP body.  ## API Authentication When you [sign up for an account](https://app.aurinko.io/#/signUp), you are given a Client Id and Secret for every application that you create. You use those to go through OAuth flows that allow you to start syncing remote account data through Aurinko. An account OAuth flow can be started with just the Client Id and the Client Secret will be required to obtain an account access token in the \"authorization code\" flow (\"implicit grant\" flow does is secured by the \"trusted domains\" setting).  Aurinko offers two forms of authentication:  - `Basic <Client Id, Client Secret>` - used for authentication flows and administrative requests made from the server side. - `Bearer <Account Access Token>` - used for working with an account data. - `Api Key in Cookie` - for in-browser apps that use Aurinko as their backend API with user sessions. - `Api Key in Header (X-Aurinko-Session)` - for server side apps that need user sessions  Never share your client secret or access token. Keep them guarded and secure.  ## Getting Started Guide If you have a use case you would like to implement, please consult us for feedback on the best API operations for the task.  [Click here to visit our API Guides](https://docs.aurinko.io/ctg-getting-started/getting-started). 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@aurinko.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.aurinko.client;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.openapitools.jackson.nullable.JsonNullableModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.aurinko.client.model.*;

import java.text.DateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class JSON {
  private ObjectMapper mapper;

  public JSON() {
    mapper = JsonMapper.builder()
        .serializationInclusion(JsonInclude.Include.NON_NULL)
        .disable(MapperFeature.ALLOW_COERCION_OF_SCALARS)
        .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
        .enable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)
        .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
        .enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)
        .enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING)
        .defaultDateFormat(new RFC3339DateFormat())
        .addModule(new JavaTimeModule())
        .build();
    JsonNullableModule jnm = new JsonNullableModule();
    mapper.registerModule(jnm);
  }

  /**
   * Set the date format for JSON (de)serialization with Date properties.
   *
   * @param dateFormat Date format
   */
  public void setDateFormat(DateFormat dateFormat) {
    mapper.setDateFormat(dateFormat);
  }

  /**
   * Get the object mapper
   *
   * @return object mapper
   */
  public ObjectMapper getMapper() { return mapper; }

  /**
   * Returns the target model class that should be used to deserialize the input data.
   * The discriminator mappings are used to determine the target model class.
   *
   * @param node The input data.
   * @param modelClass The class that contains the discriminator mappings.
   *
   * @return the target model class.
   */
  public static Class<?> getClassForElement(JsonNode node, Class<?> modelClass) {
    ClassDiscriminatorMapping cdm = modelDiscriminators.get(modelClass);
    if (cdm != null) {
      return cdm.getClassForElement(node, new HashSet<Class<?>>());
    }
    return null;
  }

  /**
   * Helper class to register the discriminator mappings.
   */
  @javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
  private static class ClassDiscriminatorMapping {
    // The model class name.
    Class<?> modelClass;
    // The name of the discriminator property.
    String discriminatorName;
    // The discriminator mappings for a model class.
    Map<String, Class<?>> discriminatorMappings;

    // Constructs a new class discriminator.
    ClassDiscriminatorMapping(Class<?> cls, String propertyName, Map<String, Class<?>> mappings) {
      modelClass = cls;
      discriminatorName = propertyName;
      discriminatorMappings = new HashMap<String, Class<?>>();
      if (mappings != null) {
        discriminatorMappings.putAll(mappings);
      }
    }

    // Return the name of the discriminator property for this model class.
    String getDiscriminatorPropertyName() {
      return discriminatorName;
    }

    // Return the discriminator value or null if the discriminator is not
    // present in the payload.
    String getDiscriminatorValue(JsonNode node) {
      // Determine the value of the discriminator property in the input data.
      if (discriminatorName != null) {
        // Get the value of the discriminator property, if present in the input payload.
        node = node.get(discriminatorName);
        if (node != null && node.isValueNode()) {
          String discrValue = node.asText();
          if (discrValue != null) {
            return discrValue;
          }
        }
      }
      return null;
    }

    /**
     * Returns the target model class that should be used to deserialize the input data.
     * This function can be invoked for anyOf/oneOf composed models with discriminator mappings.
     * The discriminator mappings are used to determine the target model class.
     *
     * @param node The input data.
     * @param visitedClasses The set of classes that have already been visited.
     *
     * @return the target model class.
     */
    Class<?> getClassForElement(JsonNode node, Set<Class<?>> visitedClasses) {
      if (visitedClasses.contains(modelClass)) {
        // Class has already been visited.
        return null;
      }
      // Determine the value of the discriminator property in the input data.
      String discrValue = getDiscriminatorValue(node);
      if (discrValue == null) {
        return null;
      }
      Class<?> cls = discriminatorMappings.get(discrValue);
      // It may not be sufficient to return this cls directly because that target class
      // may itself be a composed schema, possibly with its own discriminator.
      visitedClasses.add(modelClass);
      for (Class<?> childClass : discriminatorMappings.values()) {
        ClassDiscriminatorMapping childCdm = modelDiscriminators.get(childClass);
        if (childCdm == null) {
          continue;
        }
        if (!discriminatorName.equals(childCdm.discriminatorName)) {
          discrValue = getDiscriminatorValue(node);
          if (discrValue == null) {
            continue;
          }
        }
        if (childCdm != null) {
          // Recursively traverse the discriminator mappings.
          Class<?> childDiscr = childCdm.getClassForElement(node, visitedClasses);
          if (childDiscr != null) {
            return childDiscr;
          }
        }
      }
      return cls;
    }
  }

  /**
   * Returns true if inst is an instance of modelClass in the OpenAPI model hierarchy.
   *
   * The Java class hierarchy is not implemented the same way as the OpenAPI model hierarchy,
   * so it's not possible to use the instanceof keyword.
   *
   * @param modelClass A OpenAPI model class.
   * @param inst The instance object.
   * @param visitedClasses The set of classes that have already been visited.
   *
   * @return true if inst is an instance of modelClass in the OpenAPI model hierarchy.
   */
  public static boolean isInstanceOf(Class<?> modelClass, Object inst, Set<Class<?>> visitedClasses) {
    if (modelClass.isInstance(inst)) {
      // This handles the 'allOf' use case with single parent inheritance.
      return true;
    }
    if (visitedClasses.contains(modelClass)) {
      // This is to prevent infinite recursion when the composed schemas have
      // a circular dependency.
      return false;
    }
    visitedClasses.add(modelClass);

    // Traverse the oneOf/anyOf composed schemas.
    Map<String, Class<?>> descendants = modelDescendants.get(modelClass);
    if (descendants != null) {
      for (Class<?> childType : descendants.values()) {
        if (isInstanceOf(childType, inst, visitedClasses)) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * A map of discriminators for all model classes.
   */
  private static Map<Class<?>, ClassDiscriminatorMapping> modelDiscriminators = new HashMap<>();

  /**
   * A map of oneOf/anyOf descendants for each model class.
   */
  private static Map<Class<?>, Map<String, Class<?>>> modelDescendants = new HashMap<>();

  /**
    * Register a model class discriminator.
    *
    * @param modelClass the model class
    * @param discriminatorPropertyName the name of the discriminator property
    * @param mappings a map with the discriminator mappings.
    */
  public static void registerDiscriminator(Class<?> modelClass, String discriminatorPropertyName, Map<String, Class<?>> mappings) {
    ClassDiscriminatorMapping m = new ClassDiscriminatorMapping(modelClass, discriminatorPropertyName, mappings);
    modelDiscriminators.put(modelClass, m);
  }

  /**
    * Register the oneOf/anyOf descendants of the modelClass.
    *
    * @param modelClass the model class
    * @param descendants a map of oneOf/anyOf descendants.
    */
  public static void registerDescendants(Class<?> modelClass, Map<String, Class<?>> descendants) {
    modelDescendants.put(modelClass, descendants);
  }

  private static JSON json;

  static {
    json = new JSON();
  }

  /**
    * Get the default JSON instance.
    *
    * @return the default JSON instance
    */
  public static JSON getDefault() {
    return json;
  }

  /**
    * Set the default JSON instance.
    *
    * @param json JSON instance to be used
    */
  public static void setDefault(JSON json) {
    JSON.json = json;
  }
}
