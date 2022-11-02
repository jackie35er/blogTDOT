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
                <label for="password-confirmation" class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Passwort wiederholen: </label>
                <input type="password" id="password-confirmation" 
                bind:value={passwordConfirmation}
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg block w-full p-2"
                >
            </div>
            <div class="p-3">
                <button 
                class="bg-red-400 border border-gray-300 text-white text-sm rounded-lg  block p-2 hover:text-slate-300 transitifon-colors"
                on:click={register}
                >
                    Register
                </button>
            </div>
        </div>
    </div>
</body>

<script lang="ts">
    import { CreateUserDtoToJSON, UserControllerApi } from "../../api";


    let user = ''
    let password = ''
    let passwordConfirmation = ''


    function register(){
        if(password != passwordConfirmation){
            console.log("password not equal")
            return
        }
        

        let userApi = new UserControllerApi()

        let createUserDto = CreateUserDtoToJSON(
            {
                username: user,
                password: password,
                role:'user',
                email: '',
                profilePictureBase64: ''
            }
        )
        console.log(createUserDto)
        userApi.createUser(
            {
                createUserDto:createUserDto
            }
            )
    }

</script>