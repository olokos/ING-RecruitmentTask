/*
 * Spring Boot Rest Server API
 * Made by olokos for purposes of recruitment to ING
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * Contact: olokos@wp.pl
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.AbstractJsonSchemaPropertyObject;

/**
 * Item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Item {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, AbstractJsonSchemaPropertyObject> properties = null;

  public static final String SERIALIZED_NAME_REQUIRED_PROPERTIES = "requiredProperties";
  @SerializedName(SERIALIZED_NAME_REQUIRED_PROPERTIES)
  private List<String> requiredProperties = null;

  public Item() { 
  }

  public Item type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Item properties(Map<String, AbstractJsonSchemaPropertyObject> properties) {
    
    this.properties = properties;
    return this;
  }

  public Item putPropertiesItem(String key, AbstractJsonSchemaPropertyObject propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, AbstractJsonSchemaPropertyObject>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, AbstractJsonSchemaPropertyObject> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, AbstractJsonSchemaPropertyObject> properties) {
    this.properties = properties;
  }


  public Item requiredProperties(List<String> requiredProperties) {
    
    this.requiredProperties = requiredProperties;
    return this;
  }

  public Item addRequiredPropertiesItem(String requiredPropertiesItem) {
    if (this.requiredProperties == null) {
      this.requiredProperties = new ArrayList<String>();
    }
    this.requiredProperties.add(requiredPropertiesItem);
    return this;
  }

   /**
   * Get requiredProperties
   * @return requiredProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRequiredProperties() {
    return requiredProperties;
  }


  public void setRequiredProperties(List<String> requiredProperties) {
    this.requiredProperties = requiredProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.type, item.type) &&
        Objects.equals(this.properties, item.properties) &&
        Objects.equals(this.requiredProperties, item.requiredProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, properties, requiredProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    requiredProperties: ").append(toIndentedString(requiredProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

