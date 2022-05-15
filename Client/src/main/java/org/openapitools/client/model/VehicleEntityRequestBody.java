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
import java.math.BigDecimal;

/**
 * VehicleEntityRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-15T03:12:23.059152400+02:00[Europe/Belgrade]")
public class VehicleEntityRequestBody {
  public static final String SERIALIZED_NAME_VEHICLE_ID = "vehicleId";
  @SerializedName(SERIALIZED_NAME_VEHICLE_ID)
  private Long vehicleId;

  public static final String SERIALIZED_NAME_MAKE = "make";
  @SerializedName(SERIALIZED_NAME_MAKE)
  private String make;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_NUMBER_PLATE = "numberPlate";
  @SerializedName(SERIALIZED_NAME_NUMBER_PLATE)
  private String numberPlate;

  public static final String SERIALIZED_NAME_PURCHASED_FOR = "purchasedFor";
  @SerializedName(SERIALIZED_NAME_PURCHASED_FOR)
  private BigDecimal purchasedFor;

  /**
   * Gets or Sets vehicleTypeEnum
   */
  @JsonAdapter(VehicleTypeEnumEnum.Adapter.class)
  public enum VehicleTypeEnumEnum {
    CAR("CAR"),
    
    SCOOTER("SCOOTER"),
    
    MOTORCYCLE("MOTORCYCLE"),
    
    VAN("VAN"),
    
    LARGE("LARGE"),
    
    OTHER("OTHER"),
    
    TRACK("TRACK");

    private String value;

    VehicleTypeEnumEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VehicleTypeEnumEnum fromValue(String value) {
      for (VehicleTypeEnumEnum b : VehicleTypeEnumEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VehicleTypeEnumEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VehicleTypeEnumEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VehicleTypeEnumEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VehicleTypeEnumEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VEHICLE_TYPE_ENUM = "vehicleTypeEnum";
  @SerializedName(SERIALIZED_NAME_VEHICLE_TYPE_ENUM)
  private VehicleTypeEnumEnum vehicleTypeEnum;


  public VehicleEntityRequestBody vehicleId(Long vehicleId) {
    
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Get vehicleId
   * @return vehicleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getVehicleId() {
    return vehicleId;
  }


  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  public VehicleEntityRequestBody make(String make) {
    
    this.make = make;
    return this;
  }

   /**
   * Get make
   * @return make
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMake() {
    return make;
  }


  public void setMake(String make) {
    this.make = make;
  }


  public VehicleEntityRequestBody model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public VehicleEntityRequestBody numberPlate(String numberPlate) {
    
    this.numberPlate = numberPlate;
    return this;
  }

   /**
   * Get numberPlate
   * @return numberPlate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNumberPlate() {
    return numberPlate;
  }


  public void setNumberPlate(String numberPlate) {
    this.numberPlate = numberPlate;
  }


  public VehicleEntityRequestBody purchasedFor(BigDecimal purchasedFor) {
    
    this.purchasedFor = purchasedFor;
    return this;
  }

   /**
   * Get purchasedFor
   * @return purchasedFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPurchasedFor() {
    return purchasedFor;
  }


  public void setPurchasedFor(BigDecimal purchasedFor) {
    this.purchasedFor = purchasedFor;
  }


  public VehicleEntityRequestBody vehicleTypeEnum(VehicleTypeEnumEnum vehicleTypeEnum) {
    
    this.vehicleTypeEnum = vehicleTypeEnum;
    return this;
  }

   /**
   * Get vehicleTypeEnum
   * @return vehicleTypeEnum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VehicleTypeEnumEnum getVehicleTypeEnum() {
    return vehicleTypeEnum;
  }


  public void setVehicleTypeEnum(VehicleTypeEnumEnum vehicleTypeEnum) {
    this.vehicleTypeEnum = vehicleTypeEnum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleEntityRequestBody vehicleEntityRequestBody = (VehicleEntityRequestBody) o;
    return Objects.equals(this.vehicleId, vehicleEntityRequestBody.vehicleId) &&
        Objects.equals(this.make, vehicleEntityRequestBody.make) &&
        Objects.equals(this.model, vehicleEntityRequestBody.model) &&
        Objects.equals(this.numberPlate, vehicleEntityRequestBody.numberPlate) &&
        Objects.equals(this.purchasedFor, vehicleEntityRequestBody.purchasedFor) &&
        Objects.equals(this.vehicleTypeEnum, vehicleEntityRequestBody.vehicleTypeEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, make, model, numberPlate, purchasedFor, vehicleTypeEnum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleEntityRequestBody {\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    numberPlate: ").append(toIndentedString(numberPlate)).append("\n");
    sb.append("    purchasedFor: ").append(toIndentedString(purchasedFor)).append("\n");
    sb.append("    vehicleTypeEnum: ").append(toIndentedString(vehicleTypeEnum)).append("\n");
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
