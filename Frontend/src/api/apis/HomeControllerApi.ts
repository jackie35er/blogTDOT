/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  PostDto,
} from '../models';
import {
    PostDtoFromJSON,
    PostDtoToJSON,
} from '../models';

/**
 * 
 */
export class HomeControllerApi extends runtime.BaseAPI {

    /**
     */
    async getPostsRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<PostDto>>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/posts`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(PostDtoFromJSON));
    }

    /**
     */
    async getPosts(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<PostDto>> {
        const response = await this.getPostsRaw(initOverrides);
        return await response.value();
    }

    /**
     */
    async homeRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<string>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async home(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<string> {
        const response = await this.homeRaw(initOverrides);
        return await response.value();
    }

}
