<h1>Welcome {username}</h1>
<p>Visit <a href="https://kit.svelte.dev">kit.svelte.dev</a> to read the documentation</p>
<button on:click={func}>asdf</button>
<button on:click={logout}>logout</button>

<script lang="ts">

    import {homeApi} from "../stores/apiStores/apis";

    let username = 'world'


    function func() {
        homeApi.home().then((response) => {
            username = response
        })
    }

    function logout() {
        if(window !== undefined) {
            localStorage.removeItem('jwt')
            window.location.href = '/'
        }
    }

</script>