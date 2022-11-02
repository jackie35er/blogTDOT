<script lang="ts">


    import {isLoggedIn} from "../../stores/apiStores/apis.ts";
    import {jwtToken} from "../../stores/apiStores/JwtToken";

    function logout() {
        jwtToken.set("")
        localStorage.removeItem("jwt")
        window.location.href = "/"
    }
</script>


<div class="hidden w-full md:block bg-red-400 py-3 justify-end">
    <nav>
        <ul class="flex flex-row px-2">
            <li class="px-2 text-white hover:text-slate-300 transition-colors">
                <a href='/'>Home</a>
            </li>
            <li class="w-5/6"></li>
            {#if !isLoggedIn()}
                <li class="px-2 text-white hover:text-slate-300 transition-colors">
                    <a href='/register'>Register</a>
                </li>
                <li class="px-2 text-white hover:text-slate-300 transition-colors">
                    <a href='/login'>Login</a>
                </li>
                {:else }
                <li class="px-2 text-white hover:text-slate-300 transition-colors">
                    <a on:click={logout} href="/">Sign out</a>
                </li>
            {/if}
        </ul>
    </nav>
</div>
            