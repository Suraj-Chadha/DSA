async function Avatar(){
    let response = await fetch('https://www.javascript.info/article/promise-chaining/user.json');
    let user = await response.json();
    // console.log(user);
    let githubResponse = await fetch(`https://api.github.com/users/${user.name}`);
    let githubUser = await githubResponse.json();
    // console.log(githubUser); 
    let img = document.createElement('img');
    img.src = githubUser.avatar_url;
    document.body.append(img);
    return 0;
}
Avatar();

