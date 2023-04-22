/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.shary2023.docs;

import com.github.shary2023.docs.model.BaseResponse;
import com.github.shary2023.docs.model.CategorySchema;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-22T14:28:03.707187500+06:00[Asia/Almaty]")
@Validated
@Tag(name = "categories", description = "Methods available only to the administrator")
public interface CategoriesApi {

    /**
     * POST /categories : Create a new item category.
     * Create a new category of items (for example, electronics).
     *
     * @param categorySchema  (required)
     * @return Successful response to the creation of a new category. (status code 200)
     *         or User input error (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "createCategory",
        summary = "Create a new item category.",
        description = "Create a new category of items (for example, electronics).",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to the creation of a new category.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CategorySchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/categories",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CategorySchema> createCategory(
        @Parameter(name = "CategorySchema", description = "", required = true) @Valid @RequestBody CategorySchema categorySchema
    );


    /**
     * DELETE /categories/{categoryId} : Delete category.
     * Completely delete a category from the application (including from the database).
     *
     * @param categoryId Category entity ID (category). (required)
     * @return A successful response to deleting a category. (status code 200)
     *         or User input error. (status code 400)
     *         or The category with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "deleteCategory",
        summary = "Delete category.",
        description = "Completely delete a category from the application (including from the database).",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A successful response to deleting a category.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Boolean.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The category with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/categories/{categoryId}",
        produces = { "application/json" }
    )
    ResponseEntity<Boolean> deleteCategory(
        @Parameter(name = "categoryId", description = "Category entity ID (category).", required = true, in = ParameterIn.PATH) @PathVariable("categoryId") Long categoryId
    );


    /**
     * GET /categories : Get categories.
     * Get all categories in our service.
     *
     * @return Successful response to get all categories request. (status code 200)
     *         or User input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getAllCategories",
        summary = "Get categories.",
        description = "Get all categories in our service.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get all categories request.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CategorySchema.class)))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/categories",
        produces = { "application/json" }
    )
    ResponseEntity<List<CategorySchema>> getAllCategories(
        
    );


    /**
     * GET /categories/{categoryId} : Get category.
     * Get category by id.
     *
     * @param categoryId Category entity ID (category). (required)
     * @return Successful response to get category by id. (status code 200)
     *         or User input error. (status code 400)
     *         or The category with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getCategoryById",
        summary = "Get category.",
        description = "Get category by id.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get category by id.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CategorySchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The category with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/categories/{categoryId}",
        produces = { "application/json" }
    )
    ResponseEntity<CategorySchema> getCategoryById(
        @Parameter(name = "categoryId", description = "Category entity ID (category).", required = true, in = ParameterIn.PATH) @PathVariable("categoryId") Long categoryId
    );


    /**
     * PATCH /categories : Update category.
     * Change category name or category image.
     *
     * @param categorySchema  (required)
     * @return Successful response to a category change. (status code 200)
     *         or User input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "updateCategory",
        summary = "Update category.",
        description = "Change category name or category image.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to a category change.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CategorySchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/categories",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CategorySchema> updateCategory(
        @Parameter(name = "CategorySchema", description = "", required = true) @Valid @RequestBody CategorySchema categorySchema
    );

}
