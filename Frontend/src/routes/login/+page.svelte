<body>
    <div class="grid place-items-center h-screen ">
        <div class="block max-w-sm bg-white rounded-lg border border-gray-200 shadow-md ">
            <div class="p-3">
                <label for="user" class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">User: </label>
                <input type="text" id="user" 
                bind:value={user}
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg  block w-full p-2"
                >
            </div>
            <div class="p-3">
                <label for="password" class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Passwort: </label>
                <input type="password" id="password" 
                bind:value={password}
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg block w-full p-2"
                >
            </div>
            <div class="p-3">
                <button on:click={login}
                class="bg-red-400 border border-gray-300 text-white text-sm rounded-lg  block p-2 hover:text-slate-300 transition-colors"
                >
                    Login
                </button>
            </div>
        </div>
    </div>
</body>

<script lang="ts">
    import {Configuration, UserControllerApi} from "../../api";
    import {jwtToken} from "../../stores/apiStores/JwtToken.js";


    let user = 'user'
    let password = 'password'


    async function login() {
        let conf = new Configuration(
            {
                headers: {
                    'Authorization': 'Basic ' + btoa(user + ':' + password)
                }
            }
        )

        let auth = new UserControllerApi(conf)
        
        let token = await auth.token()
            localStorage.setItem("jwt", token)

        jwtToken.set(token)
    }
</script>

