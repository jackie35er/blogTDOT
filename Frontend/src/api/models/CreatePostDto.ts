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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CreatePostDto
 */
export interface CreatePostDto {
    /**
     * 
     * @type {string}
     * @memberof CreatePostDto
     */
    title?: string;
    /**
     * 
     * @type {string}
     * @memberof CreatePostDto
     */
    description?: string;
}

/**
 * Check if a given object implements the CreatePostDto interface.
 */
export function instanceOfCreatePostDto(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function CreatePostDtoFromJSON(json: any): CreatePostDto {
    return CreatePostDtoFromJSONTyped(json, false);
}

export function CreatePostDtoFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreatePostDto {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'title': !exists(json, 'title') ? undefined : json['title'],
        'description': !exists(json, 'description') ? undefined : json['description'],
    };
}

export function CreatePostDtoToJSON(value?: CreatePostDto | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'title': value.title,
        'description': value.description,
    };
}

