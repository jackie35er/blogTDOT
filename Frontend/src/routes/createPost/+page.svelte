<script lang="ts">
    import {homeApi} from "../../stores/apiStores/apis.ts";


    let title = ''
    let description = ''

    function post() {
        const createPostDto = {
            title,
            description
        }

        homeApi.createPost({
            createPostDto: createPostDto
        })
        window.location.href= '/'
    }

</script>

<body>
<div class="grid place-items-center h-screen ">
    <div class="block max-w-sm bg-white rounded-lg border border-gray-200 shadow-md ">
        <div class="p-3">
            <label for="title" class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Title: </label>
            <input type="text" id="title"
                    maxlength="12"
                   bind:value={title}
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg  block w-full p-2"
            >
        </div>
        <div class="p-3">
            <label for="description" class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Whats on your mind?: </label>
            <textarea id="description"
                   bind:value={description}
                   class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg block w-full p-2 h-48"></textarea>
        </div>
        <div class="p-3">
            <button on:click={post}
                    class="bg-red-400 border border-gray-300 text-white text-sm rounded-lg  block p-2 hover:text-slate-300 transition-colors">
                Post
            </button>
        </div>
    </div>
</div>
</body>


