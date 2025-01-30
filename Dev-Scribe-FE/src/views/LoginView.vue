<template>
    
    <div v-if="!isAuthenticated">
        <h1>Log in to see your notes!</h1>

        <div id="login">

            <form v-on:submit.prevent="login">
                <h1 id="login-form"></h1>
                <div role="alert" v-if="invalidCredentials">
                    Invalid credentials. Please try again.
                </div>

                

            </form>
        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style>

</style>