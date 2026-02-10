package VantinesApp;

import java.io.File;
import java.io.FileWriter;

public class valentines {

    public static void main(String[] args) {

        try {
            // 1️⃣ Create HTML file
            File htmlFile = new File("valentine.html");
            FileWriter writer = new FileWriter(htmlFile);

            writer.write(
            		 "<!DOCTYPE html>\n" +
            				    "<html>\n" +
            				    "<head>\n" +
            				    "<title>Will You Be My Valentine?</title>\n" +
            				    "<style>\n" +
            				    "body{margin:0;font-family:Arial;background:linear-gradient(135deg,#ff758c,#ff7eb3);text-align:center;color:white;overflow:hidden;}\n" +
            				    "img{margin-top:40px;border-radius:20px;box-shadow:0 10px 20px rgba(0,0,0,0.3);}\n" +
            				    "h1{margin-top:20px;font-size:40px;}\n" +
            				    
/* ❤️ PHOTO WITH ANIMATION */
"img{margin-top:40px;border-radius:20px;"
+ "box-shadow:0 10px 20px rgba(0,0,0,0.3);"
+ "animation:photoFloat 4s ease-in-out infinite, fadeIn 2s ease;}\n" +
"h1{margin-top:20px;font-size:40px;}\n" +



/* ✅ FIXED BUTTON STYLING */
".buttons{margin-top:30px;display:flex;justify-content:center;align-items:center;gap:40px;}\n" +
"button{padding:15px 30px;font-size:18px;border:none;border-radius:30px;cursor:pointer;}\n" +
"#yes{background:white;color:#ff4d6d;}\n" +
"#no{background:#ff4d6d;color:white;}\n" +

".heart{position:fixed;bottom:-20px;font-size:20px;animation:float 6s linear infinite;}\n" +
"@keyframes float{from{transform:translateY(0);opacity:1;}to{transform:translateY(-100vh);opacity:0;}}\n" +
/* ❤️ PHOTO FLOAT ANIMATION */
"@keyframes photoFloat{"
+ "0%{transform:translateY(0) scale(1);} "
+ "50%{transform:translateY(-12px) scale(1.05);} "
+ "100%{transform:translateY(0) scale(1);}"
+ "}\n" +

/* ❤️ FADE IN */
"@keyframes fadeIn{from{opacity:0;}to{opacity:1;}}\n" +

"/* Envelope */\n" +
"#envelope-container{position:relative;margin-top:50px;}\n" +
"#envelope{width:200px;cursor:pointer;transition:transform 1s ease;}\n" +
"#envelope.open{transform:rotateX(180deg);}\n" +
"#letter{margin-top:20px;font-size:22px;color:#ff4d6d;display:none;text-align:center;max-width:300px;margin-left:auto;margin-right:auto;}\n" +

"</style>\n" +
"</head>\n" +
"</style>\n" +
"</head>\n" +

"<body>\n" +
/* INTRO HEART */




            				    // ❤️ PHOTO
            				    "<img src='images/V1.jpeg' alt='My Love' width='300' height='350'>\n" +
            				    
            				    

"<h1 style='color:black;'>💖 Will You Be My Valentine? 💖</h1>\n" +


            				    // ❤️ CENTERED BUTTONS
            				    "<div class='buttons'>\n" +
            				    "  <button id='yes' onclick='yesClicked()'>YES 💕</button>\n" +
            				    "  <button id='no' onmouseover='moveNo()'>NO 😜</button>\n" +
            				    "</div>\n" +
            				    
            				    
            				    "<script>\n" +
            				    /* BACKGROUND COLOR CHANGER */
            	                "var colors=['#ffe6ec', '#ffb3c6', '#ff8fab', '#ff5d8f', '#e63946', '#ff5d8f', '#ff8fab', '#ffb3c6'];\n" +
            	                "var i=0;\n" +
            	                "setInterval(function(){\n" +
            	                "  document.body.style.background=colors[i];\n" +
            	                "  i=(i+1)%colors.length;\n" +
            	                "},1000);\n" +
            				    "function moveNo(){\n" +
            				    "  var n = document.getElementById('no');\n" +
            				    "  var x = Math.random() * 200 + 100; // jump far away\n" +
            				    "  var y = Math.random() * 100 - 50;\n" +
            				    "  n.style.position = 'relative';\n" +
            				    "  n.style.transform = 'translate(' + x + 'px,' + y + 'px)';\n" +
            				    "}\n" +
            				    
            				    "function yesClicked(){\n" +
            				    "  document.body.innerHTML = \"<h1 style='color:black;'>💌 Click the Envelope 💌</h1>\" +\n" +
            				    "    \"<div id='envelope-container'>\" +\n" +
            				    "    \"<img id='envelope' src='images/envelope.jpeg' />\" +\n" +
            				    "    \"<div id='letter'></div>\" +\n" +
            				    "    \"</div>\";\n" +
            				    "  document.getElementById('envelope').onclick = openEnvelope;\n" +
            				    "}\n" +

            				    "// Open envelope and reveal letter word by word with motion\n" +
            				    "function openEnvelope(){\n" +
            				    "  var env = document.getElementById('envelope');\n" +
            				    "  env.classList.add('open');\n" +
            				    "var container = document.getElementById('envelope-container');\n"+

            				    // Remove envelope image
            				    "env.remove();\n"+
            				    "  var letterDiv = document.getElementById('letter');\n" +
            				    "  letterDiv.style.display = 'flex';\n" +
            		             "  letterDiv.style.flexDirection = 'column';\n" +
            		             "  letterDiv.style.alignItems = 'center';\n" +
            		             "  letterDiv.style.justifyContent = 'center';\n" +
            		             "  letterDiv.style.margin = '50px auto';\n" +
            		             "  letterDiv.style.padding = '20px';\n" +
            		             "  letterDiv.style.maxWidth = '1000px';\n" +
            		             "  letterDiv.style.backgroundColor = 'rgba(255, 255, 255, 0.9)';\n" +
            		             "  letterDiv.style.borderRadius = '15px';\n" +
            		             "  letterDiv.style.boxShadow = '0 8px 20px rgba(0,0,0,0.3)';\n" +
            		             "  letterDiv.style.fontFamily = '\"Segoe Script\", cursive';\n" +
            		             "  letterDiv.style.fontSize = '26px';\n" +
            		             "  letterDiv.style.color = 'black';\n" +
            		             "  letterDiv.style.textAlign = 'center';\n" +
            		             "  letterDiv.style.lineHeight = '1.2em';\n"+ 
            	                "  var lines=[\n" +
            	                "    'My Dearest Chakku,',\n" +
            	                "    'Every moment with you is a treasure,',\n" +
            	                "    'I cherish your smile, your laugh, your heart,',\n" +
            	                "    'You are my everything.',\n" +
            	                "    'Forever yours rukku ❤️'\n" +
            	                "  ];\n" +
            	                "  var index=0;\n" +

"  function showNext(){\n" +
"    if(index >= lines.length) return;\n" +
"    var p = document.createElement('p');\n" +
"    p.textContent = lines[index];\n" +
"    p.style.margin = '4px 0';\n"+ 
"    p.style.opacity = 0;\n" +
"    p.style.transform = 'translateY(20px)';\n" +
"    p.style.transition = 'all 1s ease';\n" +
"    letterDiv.appendChild(p);\n" +
"    setTimeout(function(){\n" +
"      p.style.opacity=1;\n" +
"      p.style.transform='translateY(0)';\n" +
"    },50);\n" +
"    index++;\n" +
"    setTimeout(showNext, 1000);\n" +
"  }\n" +
"  showNext();\n" +
"}\n" +

            				    "setInterval(function(){\n" +
            				    "  var h=document.createElement('div');\n" +
            				    "  h.className='heart';\n" +
            				    "  h.innerHTML='❤️';\n" +
            				    "  h.style.left=Math.random()*100+'vw';\n" +
            				    "  document.body.appendChild(h);\n" +
            				    "  setTimeout(function(){h.remove();},6000);\n" +
            				    "},300);\n" +

            				    "</script>\n" +
            				    "</body>\n" +
            				    "</html>"
            				);

            writer.close();

            // 2️⃣ Force open in Google Chrome (Windows)
            String chromePath = "C:\\\\Program Files\\\\Google\\\\Chrome\\\\Application\\\\chrome.exe";
            String chromePath86 = "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\\\chrome.exe";

            if (new File(chromePath).exists()) {
                Runtime.getRuntime().exec(new String[]{chromePath, htmlFile.getAbsolutePath()});
            } else if (new File(chromePath86).exists()) {
                Runtime.getRuntime().exec(new String[]{chromePath86, htmlFile.getAbsolutePath()});
            } else {
                System.out.println("Chrome not found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}