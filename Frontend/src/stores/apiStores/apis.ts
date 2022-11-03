import {Configuration, HomeControllerApi, UserControllerApi} from "../../api";
import {browser} from "$app/environment";
import {readable, writable} from "svelte/store";
import {jwtToken} from "./JwtToken";

export function isLoggedIn(): boolean {
    return getLocalJwtToken() != ""
}

export function getLocalJwtToken(): string {
    if (!browser) {
        return ""
    }
    return window.localStorage.getItem("jwt") || "";
}

let conf = new Configuration({
        headers: {
            "Authorization": ("Bearer " + getLocalJwtToken())
        }
    }
)

jwtToken.subscribe((value) => {
        console.log(value)
        conf.config = new Configuration({
            headers: {
                "Authorization": ("Bearer " + getLocalJwtToken())
            }
        })
    }
)

export const homeApi = new HomeControllerApi(conf)
