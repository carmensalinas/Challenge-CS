// With css
website.sendText("myName", "css", 'input[name^="user-submitted-name"', "Carmen Salinas"); 
website.sendText("myEmail", "css", 'input[name^="user-submitted-email"', "carmen12.salinas@gmail.com"); 
website.sendText("myProductTitle", "css", 'input[name^="user-submitted-title"', "SR CHALLENGE"); 
website.sendText("myProductUrl", "css", 'input[name^="user-submitted-url[]"', "https://apprater.net/add/"); 
website.sendText("myProductDescription", "css", 'input[name^="user-submitted-content"', "Caso Selectores Web");
// With name
website.sendText("myName", "name", "user-submitted-name", "Carmen Salinas"); 
website.sendText("myEmail", "name", "user-submitted-email", "carmen12.salinas@gmail.com"); 
website.sendText("myProductTitle", "name", "user-submitted-title", "SR CHALLENGE"); 
website.sendText("myProductUrl", "name", "user-submitted-url[]", "https://apprater.net/add/"); 
website.sendText("myProductDescription", "name", "user-submitted-content", "Caso Selectores Web");
// With xpath 
website.sendText("myName", "xpath", "//input[@name='user-submitted-name']", "Carmen Salinas"); 
website.sendText("myEmail", "xpath", "//input[@name='user-submitted-email']", "carmen12.salinas@gmail.com"); 
website.sendText("myProductTitle", "xpath", "//input[@name='user-submitted-title']", "SR CHALLENGE"); 
website.sendText("myProductUrl", "xpath", "//input[@name='user-submitted-url[]']", "https://apprater.net/add/"); 
website.sendText("myProductDescription", "xpath", "//input[@name='user-submitted-content']", "Caso Selectores Web");  
