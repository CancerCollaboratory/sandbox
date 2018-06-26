/*
 * workflow_execution.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Ga4ghWesParameterTypes;
import java.io.IOException;

/**
 * Parameters for workflows or tasks, these are either output parameters, files, or directories, the latter two are stagged to an object store or something similar for hand back to the caller.
 */
@ApiModel(description = "Parameters for workflows or tasks, these are either output parameters, files, or directories, the latter two are stagged to an object store or something similar for hand back to the caller.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-07T15:00:20.150-08:00")
public class Ga4ghWesParameter {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("type")
  private Ga4ghWesParameterTypes type = null;

  public Ga4ghWesParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ga4ghWesParameter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Ga4ghWesParameter location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Ga4ghWesParameter type(Ga4ghWesParameterTypes type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Ga4ghWesParameterTypes getType() {
    return type;
  }

  public void setType(Ga4ghWesParameterTypes type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ga4ghWesParameter ga4ghWesParameter = (Ga4ghWesParameter) o;
    return Objects.equals(this.name, ga4ghWesParameter.name) &&
        Objects.equals(this.value, ga4ghWesParameter.value) &&
        Objects.equals(this.location, ga4ghWesParameter.location) &&
        Objects.equals(this.type, ga4ghWesParameter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, location, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesParameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

