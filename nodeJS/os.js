const os = require("os"); // Returns OS module

//Returns the operating system CPU architecture for which the Node.js binary was compiled.
let mySystemArchitecture = os.arch();
console.log(mySystemArchitecture);

//Returns an array of objects containing information about each logical CPU core.
let cpuInfo = os.cpus();
// console.log(cpuInfo);

//Returns the host name of the operating system as a string
let myHostName = os.hostname();
// console.log(myHostName);

//Returns an object containing network interfaces that have been assigned a network address.
let networkInfo = os.networkInterfaces();
// console.log(networkInfo);

// Returns the system uptime in number of seconds.
console.log(os.uptime());
console.log(os.uptime()/3600); // uptime in number of hours

//Returns the operating system as a string.
console.log(os.release());

//Returns the total amount of system memory in bytes as an integer.
console.log(os.totalmem());

//Returns information about the currently effective user. On POSIX platforms, this is typically a subset of the password file.
console.log(os.userInfo());

//Returns a string identifying the operating system platform. The value is set at compile time. 
console.log(os.platform());

//Returns the operating system name
console.log(os.type());

