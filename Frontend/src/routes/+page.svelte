<script lang="ts">

    import {homeApi} from "../stores/apiStores/apis";
    import {isLoggedIn} from "../stores/apiStores/apis.js";

    let username = 'world'
    let posts = []
    if (isLoggedIn()) {
        homeApi.home().then((response) => {
            username = response
        })
        homeApi.getPosts().then((response) => {
            posts = response
        })
    }


</script>

{#if !isLoggedIn()}
    <div>
        Please login to see posts
    </div>
{:else}
    <div class="grid place-items-center h-screen ">
        {#each posts as post}
        <div class="p-1 m-2 block bg-white rounded-lg border border-gray-200 shadow-md w-1/2" >
            <p class="text-lg">{post.title}</p> 
            <p class="text-sm overflow-auto">{post.description}</p>
            <p class="block mb-2 text-xs font-medium text-gray-900 dark:text-gray-600">by {post.authorName} </p>
        </div>

        {/each}
    </div>

{/if}