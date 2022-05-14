# VehiclesControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVehicles**](VehiclesControllerApi.md#getVehicles) | **GET** /vehicles | 


<a name="getVehicles"></a>
# **getVehicles**
> List&lt;VehicleEntity&gt; getVehicles()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehiclesControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    VehiclesControllerApi apiInstance = new VehiclesControllerApi(defaultClient);
    try {
      List<VehicleEntity> result = apiInstance.getVehicles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesControllerApi#getVehicles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;VehicleEntity&gt;**](VehicleEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

