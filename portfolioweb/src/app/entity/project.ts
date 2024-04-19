export class Project {
    id:number=0;
    title:String;
    imagePath:String;
    description:String;

    constructor(title:String,imagePath:String,description:String){
        this.title=title;
        this.imagePath=imagePath;
        this.description=description;
    }
}
