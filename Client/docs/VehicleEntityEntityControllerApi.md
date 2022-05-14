# VehicleEntityEntityControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteItemResourceVehicleentityDelete**](VehicleEntityEntityControllerApi.md#deleteItemResourceVehicleentityDelete) | **DELETE** /vehicleEntities/{id} | 
[**getCollectionResourceVehicleentityGet1**](VehicleEntityEntityControllerApi.md#getCollectionResourceVehicleentityGet1) | **GET** /vehicleEntities | 
[**getItemResourceVehicleentityGet**](VehicleEntityEntityControllerApi.md#getItemResourceVehicleentityGet) | **GET** /vehicleEntities/{id} | 
[**patchItemResourceVehicleentityPatch**](VehicleEntityEntityControllerApi.md#patchItemResourceVehicleentityPatch) | **PATCH** /vehicleEntities/{id} | 
[**postCollectionResourceVehicleentityPost**](VehicleEntityEntityControllerApi.md#postCollectionResourceVehicleentityPost) | **POST** /vehicleEntities | 
[**putItemResourceVehicleentityPut**](VehicleEntityEntityControllerApi.md#putItemResourceVehicleentityPut) | **PUT** /vehicleEntities/{id} | 


<a name="deleteItemResourceVehicleentityDelete"></a>
# **deleteItemResourceVehicleentityDelete**
> deleteItemResourceVehicleentityDelete(id)



delete-vehicleentity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehicleEntityEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    VehicleEntityEntityControllerApi apiInstance = new VehicleEntityEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteItemResourceVehicleentityDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling VehicleEntityEntityControllerApi#deleteItemResourceVehicleentityDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

<a name="getCollectionResourceVehicleentityGet1"></a>
# **getCollectionResourceVehicleentityGet1**
> PagedModelEntityModelVehicleEntity getCollectionResourceVehicleentityGet1(page, size, sort)



get-vehicleentity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehicleEntityEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    VehicleEntityEntityControllerApi apiInstance = new VehicleEntityEntityControllerApi(defaultClient);
    Integer page = 0; // Integer | Zero-based page index (0..N)
    Integer size = 20; // Integer | The size of the page to be returned
    List<String> sort = Arrays.asList(); // List<String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
    try {
      PagedModelEntityModelVehicleEntity result = apiInstance.getCollectionResourceVehicleentityGet1(page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VehicleEntityEntityControllerApi#getCollectionResourceVehicleentityGet1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Zero-based page index (0..N) | [optional] [default to 0]
 **size** | **Integer**| The size of the page to be returned | [optional] [default to 20]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**PagedModelEntityModelVehicleEntity**](PagedModelEntityModelVehicleEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/x-spring-data-compact+json, text/uri-list

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getItemResourceVehicleentityGet"></a>
# **getItemResourceVehicleentityGet**
> EntityModelVehicleEntity getItemResourceVehicleentityGet(id)



get-vehicleentity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehicleEntityEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    VehicleEntityEntityControllerApi apiInstance = new VehicleEntityEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      EntityModelVehicleEntity result = apiInstance.getItemResourceVehicleentityGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VehicleEntityEntityControllerApi#getItemResourceVehicleentityGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**EntityModelVehicleEntity**](EntityModelVehicleEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |

<a name="patchItemResourceVehicleentityPatch"></a>
# **patchItemResourceVehicleentityPatch**
> EntityModelVehicleEntity patchItemResourceVehicleentityPatch(id, vehicleEntityRequestBody)



patch-vehicleentity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehicleEntityEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    VehicleEntityEntityControllerApi apiInstance = new VehicleEntityEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    VehicleEntityRequestBody vehicleEntityRequestBody = new VehicleEntityRequestBody(); // VehicleEntityRequestBody | 
    try {
      EntityModelVehicleEntity result = apiInstance.patchItemResourceVehicleentityPatch(id, vehicleEntityRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VehicleEntityEntityControllerApi#patchItemResourceVehicleentityPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **vehicleEntityRequestBody** | [**VehicleEntityRequestBody**](VehicleEntityRequestBody.md)|  |

### Return type

[**EntityModelVehicleEntity**](EntityModelVehicleEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |

<a name="postCollectionResourceVehicleentityPost"></a>
# **postCollectionResourceVehicleentityPost**
> EntityModelVehicleEntity postCollectionResourceVehicleentityPost(vehicleEntityRequestBody)



create-vehicleentity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehicleEntityEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    VehicleEntityEntityControllerApi apiInstance = new VehicleEntityEntityControllerApi(defaultClient);
    VehicleEntityRequestBody vehicleEntityRequestBody = new VehicleEntityRequestBody(); // VehicleEntityRequestBody | 
    try {
      EntityModelVehicleEntity result = apiInstance.postCollectionResourceVehicleentityPost(vehicleEntityRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VehicleEntityEntityControllerApi#postCollectionResourceVehicleentityPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleEntityRequestBody** | [**VehicleEntityRequestBody**](VehicleEntityRequestBody.md)|  |

### Return type

[**EntityModelVehicleEntity**](EntityModelVehicleEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="putItemResourceVehicleentityPut"></a>
# **putItemResourceVehicleentityPut**
> EntityModelVehicleEntity putItemResourceVehicleentityPut(id, vehicleEntityRequestBody)



update-vehicleentity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehicleEntityEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    VehicleEntityEntityControllerApi apiInstance = new VehicleEntityEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    VehicleEntityRequestBody vehicleEntityRequestBody = new VehicleEntityRequestBody(); // VehicleEntityRequestBody | 
    try {
      EntityModelVehicleEntity result = apiInstance.putItemResourceVehicleentityPut(id, vehicleEntityRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VehicleEntityEntityControllerApi#putItemResourceVehicleentityPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **vehicleEntityRequestBody** | [**VehicleEntityRequestBody**](VehicleEntityRequestBody.md)|  |

### Return type

[**EntityModelVehicleEntity**](EntityModelVehicleEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**204** | No Content |  -  |

